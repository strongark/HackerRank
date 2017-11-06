package com.tranmpham.hackerrank.hackerrank;

import org.omg.CORBA.INTERNAL;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tranpham on 11/4/17.
 */
@Controller
@RequestMapping(path = "/array")
public class ArrayController {

    @GetMapping(path = "/manipulation")
    public @ResponseBody
    String solveArrayManipulation(@RequestParam String input){
    /*
    * You are given a list(1-indexed) of size , initialized with zeroes.
    * You have to perform  operations on the list and output the maximum of final values of all the
    * elements in the list. For every operation, you are given three integers ,
    * and  and you have to add value  to all the elements ranging from index  to (both inclusive).

    For example, consider a list  of size . The initial list would be  = [0, 0, 0]
    and after performing the update f(a,b,k) = (2,3,30), the new list would be  = [0, 30, 30].
    Here, we've added value 30 to elements between indices 2 and 3.
    Note the index of the list starts from 1.

    Input Format

    The first line will contain two integers n and n separated by a single space.
    Next  lines will contain three integers a, b and k separated by a single space.
    Numbers in list are numbered from 1 to n.

    Constraints

    Output Format

    Print in a single line the maximum value in the updated list.

    Sample Input

    5 3
    1 2 100
    2 5 100
    3 4 100
    Sample Output

    200
    Explanation

    After first update list will be 100 100 0 0 0.
    After second update list will be 100 200 100 100 100.
    After third update list will be 100 200 200 200 100.
    So the required answer will be 200.
    * */
        String[] strings = input.split("\n");
        String[] first_line = strings[0].split(" ");
        int n= Integer.parseInt(first_line[0]);
        int m= Integer.parseInt(first_line[1]);
        long[] num= new long[n];
        long max_val=0;
        for (int i=1;i<=m;i++){
            String[] linex= strings[i].split(" ");
            int a = Integer.parseInt(linex[0]);
            int b = Integer.parseInt(linex[1]);
            int k = Integer.parseInt(linex[2]);
//            for(int j=a-1;j<=b-1;j++){
//                num[j]+=k;
//                if(num[j]>max_val)
//                    max_val=num[j];
//            }
            num[a-1]+=k;
            if(b<n)
                num[b]-=k;
        }
        long sum=0;
        for(int j=0;j<n;j++)
        {
            sum+=num[j];
            if(max_val<sum)
                max_val=sum;
        }

        return ""+max_val;
    }

}
