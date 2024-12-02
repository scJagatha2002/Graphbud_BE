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

import com.jagatha.Graphbud_BE.IServices.IRevenueService;
import com.jagatha.Graphbud_BE.Model.profit_loss;
import com.jagatha.Graphbud_BE.Request.RevenueReq;
import com.jagatha.Graphbud_BE.Response.companyRes;

@RestController
@RequestMapping("api/profit_loss")
public class RevenueController {

    @Autowired
    private IRevenueService cs;

    @PostMapping("/")                                                     
    public ResponseEntity<profit_loss> add(@RequestBody RevenueReq req){
        profit_loss c = cs.add(req);
        return new ResponseEntity<>(c,HttpStatus.CREATED);
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<companyRes> delete(@PathVariable Long Id){
        cs.delete(Id);
        companyRes c = new companyRes("Deleted successsfully");
        return new ResponseEntity<>(c,HttpStatus.OK);
    }
     
    @GetMapping("/")                                                   
    public ResponseEntity<List<profit_loss>> get_all(){
        List<profit_loss> c = cs.get_all();
        return new ResponseEntity<>(c,HttpStatus.OK);
    }

    @GetMapping("/{Id}")
    public ResponseEntity<profit_loss> get_by_id(@PathVariable Long Id){          
        profit_loss c = cs.get_by_id(Id);
        return new ResponseEntity<>(c,HttpStatus.OK);
    }

    @PutMapping("/{Id}")
    public ResponseEntity<profit_loss> update(@RequestBody RevenueReq req,@PathVariable Long Id){              
        profit_loss c = cs.update(req, Id);
        return new ResponseEntity<>(c,HttpStatus.OK);
    }
    
}
