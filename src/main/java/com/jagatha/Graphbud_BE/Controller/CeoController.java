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

import com.jagatha.Graphbud_BE.IServices.ICeoService;
import com.jagatha.Graphbud_BE.Model.ceo;
import com.jagatha.Graphbud_BE.Request.CeoRequest;
import com.jagatha.Graphbud_BE.Response.companyRes;



@RestController
@RequestMapping("api/ceo")

public class CeoController {

     @Autowired
    private ICeoService cs;

    @PostMapping("/")                                                     
    public ResponseEntity<ceo> add(@RequestBody CeoRequest req){
        ceo c = cs.add(req);
        return new ResponseEntity<>(c,HttpStatus.CREATED);
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<companyRes> delete(@PathVariable Long Id){
        cs.delete(Id);
        companyRes c = new companyRes("Deleted successsfully");
        return new ResponseEntity<>(c,HttpStatus.OK);
    }
     
    @GetMapping("/")                                                   
    public ResponseEntity<List<ceo>> get_all(){
        List<ceo> c = cs.get_all();
        return new ResponseEntity<>(c,HttpStatus.OK);
    }

    @GetMapping("/{Id}")
    public ResponseEntity<ceo> get_by_id(@PathVariable Long Id){          
        ceo c = cs.get_by_id(Id);
        return new ResponseEntity<>(c,HttpStatus.OK);
    }

    @PutMapping("/{Id}")
    public ResponseEntity<ceo> update(@RequestBody CeoRequest req,@PathVariable Long Id){              
        ceo c = cs.update(req, Id);
        return new ResponseEntity<>(c,HttpStatus.OK);
    }
    
}
