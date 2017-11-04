package com.tranmpham.hackerrank.hackerrank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tranpham on 11/4/17.
 */
@Controller
@RequestMapping(path = "/array")
public class ArrayController {

    @GetMapping(path = "/manipulation")
    public @ResponseBody
    String solveArrayManipulation(){

        return "Solve!";
    }

}
