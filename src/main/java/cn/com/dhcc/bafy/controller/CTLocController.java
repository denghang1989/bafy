package cn.com.dhcc.bafy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import cn.com.dhcc.bafy.dto.Result;
import cn.com.dhcc.bafy.entity.Loc;
import cn.com.dhcc.bafy.service.CTLocService;

@RestController
@RequestMapping("/loc")
public class CTLocController {

    @Autowired
    CTLocService mCTLocService;

    @GetMapping("/all")
    public List<Loc> getAllLoc(String type){
        return  mCTLocService.getAllLoc(type.toUpperCase());
    }

    @DeleteMapping("/delete")
    public Result<String> delete(@RequestParam("id") String locId){
        Result<String> result = new Result<>();

        return result;
    }
}
