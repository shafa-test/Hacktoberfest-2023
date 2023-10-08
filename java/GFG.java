// Java program to find the length of the
// longest substring without repeating
// characters
import java.io.*;
import java.util.*;

class GFG{

public static int longestUniqueSubsttr(String str)
{
	int n = str.length();
	int res = 0;
	for(int i = 0; i < n; i++)
	{
		boolean[] visited = new boolean[256];
		for(int j = i; j < n; j++)
		{

			if (visited[str.charAt(j)] == true)
				break;
			else
			{
				res = Math.max(res, j - i + 1);
				visited[str.charAt(j)] = true;
			}
		}
		visited[str.charAt(i)] = false;
	}
	return res;
}
public static void main(String[] args)
{
	String str = "geeksforgeeks";
	System.out.println("The input string is " + str);

	int len = longestUniqueSubsttr(str);
	System.out.println("The length of the longest " +
					"non-repeating character " +
					"substring is " + len);
}
}

// This code is contributed by akhilsaini
