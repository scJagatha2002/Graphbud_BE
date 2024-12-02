package com.jagatha.Graphbud_BE.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jagatha.Graphbud_BE.IServices.ICompnayService;
import com.jagatha.Graphbud_BE.Model.company;
import com.jagatha.Graphbud_BE.Request.CompanyReq;
import com.jagatha.Graphbud_BE.Response.companyRes;


@RestController
@RequestMapping("api/company")
public class CompanyController {

    @Autowired
    private ICompnayService cs;

    @PostMapping("/")                                                     
    public ResponseEntity<company> add(@RequestBody CompanyReq req){
        company c = cs.add(req);
        return new ResponseEntity<>(c,HttpStatus.CREATED);
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<companyRes> delete(@PathVariable Long Id){
        cs.delete(Id);
        companyRes c = new companyRes("Deleted successsfully");
        return new ResponseEntity<>(c,HttpStatus.OK);
    }
     
    @GetMapping("/")                                                   
    public ResponseEntity<List<company>> get_all(){
        List<company> c = cs.get_all();
        return new ResponseEntity<>(c,HttpStatus.OK);
    }

    @GetMapping("/{Id}")
    public ResponseEntity<company> get_by_id(@PathVariable Long Id){          
        company c = cs.get_by_id(Id);
        return new ResponseEntity<>(c,HttpStatus.OK);
    }

    @PutMapping("/{Id}")
    public ResponseEntity<company> update(@RequestBody CompanyReq req,@PathVariable Long Id){              
        company c = cs.update(req, Id);
        return new ResponseEntity<>(c,HttpStatus.OK);
    }
}
