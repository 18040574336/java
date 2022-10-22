package com.gantang.interview;

import org.junit.Test;

import java.io.Serializable;
import java.util.Date;
import java.util.stream.IntStream;

public class Question  implements Serializable {

	static{
		d = new Date();
	}
	private static Date d = null;

	public static void main(String[] args) {
		System.out.println(d);
//        subject1();
//
//        subject2(5);
//
//        subject3();
	/*	subject31();
        System.out.println(subject4(5));
        System.out.println(subject4(2));
        System.out.println(subject4(7));
        System.out.println(subject4(0));*/


		subject3();

	}

	private static void subject1() {
		String msg = "Hello?World";
		//第一种答案
		//System.out.println(StringUtils.reverse(msg));
		//第二种答案
		System.out.println(new StringBuffer(msg).reverse().toString());
		//第三种答案
		StringBuilder sb = new StringBuilder();
		for (int i = msg.length() - 1; i >= 0; i--) {
			sb.append(msg.charAt(i));
		}
		System.out.println(sb.toString());

		//第四种答案
		char[] chars = msg.toCharArray();
		sb = new StringBuilder();
		for (int i = chars.length - 1; i >= 0; i--) {
			sb.append(msg.charAt(i));
		}
		System.out.println(sb.toString());

		//第五种答案
		String[] strs = msg.split("");
		for (int i = strs.length - 1; i >= 0; i--) {
			System.out.print(strs[i]);
		}

	}

	private static int factorial(int n) {
		if (n <= 1)
			return 1;
		int a =  factorial(n - 1) * n;
		System.out.println(a);
		return a ;
	}

	@Test
	public  void test(){

		int factorial = factorial(5);
		System.out.println(factorial);
	}

	private static void subject2(int n) {
		int value = 0;
		//第一种答案
		value = factorial(n);
		System.out.printf("递归算法\t%d的阶层是:%d\n", n, value);

		//第二种答案
		value = IntStream.rangeClosed(1, n).reduce(1, (n1, n2) -> n1 * n2);
		System.out.printf("归约算法\t%d的阶层是:%d\n", n, value);
	}

	private static void subject3() {
		int maxSum = 0;
		int arr[] = {-2, 11, -4, 13, -5, -2};
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
			System.out.println("第" + (i + 1) + "伦\t" + maxSum);
		}
		System.out.println("maxSum:\t" + maxSum);
	}

	private static void subject31() {
		int maxSum = 0;
		int arr[] = {-2, 11, -4, 13, -5, -2};
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = arr.length-i-1; j>=0 ; j--) {
				sum += arr[j];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
			System.out.println("第" + (i + 1) + "轮:\t" + maxSum);
		}
		System.out.println("maxSum:\t" + maxSum);
	}

	/**
	 * 给定一个已从小到大排序数组和一个目标值，数组中无重复元素，在数组中找到目标值，并返回其索引，索引位置从0开计算。
	 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
	 *
	 * @param targetValue
	 * @return
	 */
	private static int subject4(int targetValue) {
		int[] nums = new int[]{1, 3, 5, 6};
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= targetValue) {
				return i;
			}
		}
		return nums.length;
	}

	/**
	 * 给定一个二叉树，找出其最大深度。
	 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。二叉树的数据结构如下：
	 *
	 * @param root
	 * @return
	 */
	private static int maxDepth(Node root) {
		if (null == root) return 0;
		return 1 + Math.max(maxDepth(root.leftChild), maxDepth(root.rightChild));
	}

	class Node {
		Node leftChild;
		Node rightChild;
	}
}
