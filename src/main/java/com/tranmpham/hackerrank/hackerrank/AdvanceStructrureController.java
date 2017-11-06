package com.tranmpham.hackerrank.hackerrank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * Created by tranpham on 11/5/17.
 */
@Controller
@RequestMapping(path = "/advance")
public class AdvanceStructrureController {

    @GetMapping(path = "/almostequal")
    public @ResponseBody String solveAlmostEqual(@RequestParam String input){

        String[] strings=input.split("\n");
        String[] line0= strings[0].split(" ");
        int N=Integer.parseInt(line0[0]);
        int K=Integer.parseInt(line0[1]);
        int[] nums=new int[N];
        String[] numStr= strings[1].split(" ");
        for (int i=0;i<N;i++)
            nums[i]=Integer.parseInt(numStr[i]);
        int Q=Integer.parseInt(strings[2]);
        //the series of query start here
        /*
        * 5 2
        * 1 3 4 3 0
        * 3
        * 0 1
        * 1 3
        * 0 4
        * */
        String result="";
        for (int i=0;i<Q;i++){
            int match=0;
            String[] query= strings[3+i].split(" ");
            int l= Integer.parseInt(query[0]);
            int r= Integer.parseInt(query[1]);
            for(int j=l;j<=r-1;j++)
                for(int k=j+1;k<=r;k++)
                    if(Math.abs(nums[j]-nums[k])<=K)
                        match++;
            result+=match;
            result+="\n";
        }
        return result;
    }
}
