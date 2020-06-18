package selfstudy.exec01.dss01.combi_perrm;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.LinkedList;

import java.util.List;



public class ���չ׼���Summary {

 public static void main(String[] args) {



  String rpadStr = rpad("999999",10,'#');

  String lpadStr = lpad("999999",10,'#');

  

  String lpadStr1 = pad("######################################", "999999",true);

  String rpadStr1 = pad("######################################","999999",false);

  

  List<String> list = permutationExample(5,5);
  
  
  exampleMain(5,5);

  System.out.println(list.size());

 }

 public static String pad(String strBase, String value, boolean isLpad) {

  if(value.length() >= strBase.length()) return value;

  if(isLpad) {

   return strBase.substring(value.length()) + value;

  }else {

   return value + strBase.substring(value.length(),strBase.length());

  }

 }

 public static String lpad(String value, int length, char padChar) {

  if(value.length() >=  length) return value;

  char[] charBuf = new char[length];

  int padLenth = length - value.length();

  Arrays.fill(charBuf, 0, padLenth, padChar);

  value.getChars(0, value.length(), charBuf, padLenth);

  return new String(charBuf);

 }

 public static String rpad(String value, int length, char padChar) {

  if(value.length() >=  length) return value;

  char[] charBuf = new char[length];

  Arrays.fill(charBuf, value.length(), length, padChar);

  value.getChars(0,value.length(), charBuf, 0);

  return new String(charBuf);

 }

 //1���� m������ ���� ������ n���� �̾Ƽ� ����� �ִ� ����� ��(�ߺ� ������� ����), ����(�ߺ������ƴ�)

 public static List<String> permutationExample(int N, int R ) {

  int[] intArr = new int[N];

  boolean[] selected = new boolean[N];

  int[] intRsltArray = new int[R];

  for(int i = 0; i < N; i++ ) {

   intArr[i] = i + 1;

  }

  List<String> list = new ArrayList<String>();

  permutation(0,intArr, intRsltArray,selected,list);

  return list;

 }

 

 private static void permutation(int pos,int[] intArr, int[] intRsltArray,boolean[] selected,List<String> list) {

  if(pos == intRsltArray.length) {

   list.add(Arrays.toString(intRsltArray));

//   System.out.println(Arrays.toString(intRsltArray));

   return;

  }

  for(int i=0; i<intArr.length; i++) {

   if(!selected[i]) {

    selected[i] = true;

    intRsltArray[pos] = intArr[i];

    permutation(pos+1,intArr,intRsltArray,selected,list);

    selected[i] = false;

   }

  }

 }

 public static void exampleMain(int N, int R ) {



        int n = 5;

        int r = 5;

        //���� (�����ְ� �迭)

        System.out.println("***����(0,1,2)***");

        LinkedList<Integer> perArr = new LinkedList<Integer>(); 

        int[] perCheck = new int[n];

        permutation(n, r, perArr, perCheck);

         

        //�ߺ����� (�����ְ� �迭 + �ڽ��ڽŵ� ����)

        System.out.println("***�ߺ�����(0,1,2)***");

        LinkedList<Integer> rePerArr = new LinkedList<Integer>();   

        rePermutation(n, r, perArr);

         

        //���� (�������ɾ��� ���� ������ ����)

        System.out.println("***����(0,1,2)***");

        int[] comArr = new int[r];

        combination(comArr, n, r, 0, 0);

        //�ߺ� ���� (�������ɾ��� ���� ������ ���� + �ڱ��ڽŵ� ����)

        System.out.println("***�ߺ�����(0,1,2)***");

        int[] reComArr = new int[r];

        reCombination(reComArr, n, r, 0, 0);

 }

 

 

 //�ߺ� ���� (�������ɾ��� ���� ������ ���� + �ڱ��ڽŵ� ����)

    private static void reCombination(int[] reComArr, int n, int r, int index, int target) {

        if(r==0){

            for(int i : reComArr){

                System.out.print(i+" ");

            }

            System.out.println();

            return;

        }       

        if(target == n)return;

         

        reComArr[index] = target;

        reCombination(reComArr, n, r-1, index+1, target);//�̴°��

        reCombination(reComArr, n, r, index, target+1);//�Ȼ̴°��

         

    }

    //���� (�������ɾ��� ���� ������ ����)

    private static void combination(int[] comArr, int n, int r, int index, int target) {

        if(r==0){

            for(int i : comArr){

                System.out.print(i+" ");

            }

            System.out.println();

            return;

        }

        if(target == n)return;

         

        comArr[index] = target;

        combination(comArr, n, r-1, index+1, target+1);//�̴°��

        combination(comArr, n, r, index, target+1);//�Ȼ̴°��

         

    }

    //�ߺ����� (�����ְ� �迭 + �ڽ��ڽŵ� ����)

    private static void rePermutation(int n, int r, LinkedList<Integer> rePerArr) {

        if(rePerArr.size() == r){

            for(int i : rePerArr){

                System.out.print(i+" ");

            }

            System.out.println();

            return;

        }

        for(int i=0; i<n; i++){  

            rePerArr.add(i);

            rePermutation(n, r, rePerArr);

            rePerArr.removeLast();

        }

    }

    //���� (�����ְ� �迭)

    private static void permutation(int n, int r, LinkedList<Integer> perArr, int[] perCheck) {

        if(perArr.size() == r){

            for(int i : perArr){

                System.out.print(i+" ");

            }

            System.out.println();

            return;

        }

        for(int i=0; i<n; i++){

            if(perCheck[i] == 0){

                perArr.add(i);

                perCheck[i] = 1;

                permutation(n, r, perArr, perCheck);

                perCheck[i] = 0;

                perArr.removeLast();

            }

        }

         

    }

}