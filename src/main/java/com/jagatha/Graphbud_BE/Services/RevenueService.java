package com.jagatha.Graphbud_BE.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagatha.Graphbud_BE.IServices.IRevenueService;
import com.jagatha.Graphbud_BE.Model.company;
import com.jagatha.Graphbud_BE.Model.profit_loss;

import com.jagatha.Graphbud_BE.Repository.company_repo;

import com.jagatha.Graphbud_BE.Repository.profit_loss_repo;
import com.jagatha.Graphbud_BE.Request.RevenueReq;

@Service
public class RevenueService implements IRevenueService {

    @Autowired
    private profit_loss_repo repo;

    @Autowired
    private company_repo repoC;

    @Override
    public profit_loss add(RevenueReq profit_loss) {
        profit_loss e = new profit_loss();
        company c = new company();
        Optional<company> c1 = repoC.findById(profit_loss.getCompanyId());

        if (c1 != null) {
            c = c1.get();
        }

        e.setCompany(c);
        e.setId(profit_loss.getRevenueId());
        e.setLoss(profit_loss.getLoss());
        e.setProfit(profit_loss.getProfit());
        repo.save(e);
        return e;
    }

    @SuppressWarnings("null")
    @Override
    public void delete(Long id) {
        Optional<profit_loss> c = repo.findByCompanyId(id);
        if (c.isPresent()) {
            repo.delete(c.get());
        }
    }

    @Override
    public List<profit_loss> get_all() {
        List<profit_loss> c = repo.findAll();
        return c;
    }

    @Override
    public profit_loss get_by_id(Long id) {
        Optional<profit_loss> c = repo.findById(id);
        if (c.isPresent()) {
            return c.get();
        }
        return null;
    }

    @Override
    public profit_loss update(RevenueReq profit_loss, Long id) {
        Optional<profit_loss> c = repo.findById(id);
        if (c.isPresent()) {
            profit_loss c1 = c.get();
            c1.setLoss(profit_loss.getLoss());
            c1.setProfit(profit_loss.getProfit());
            repo.save(c1);
            return c1;
        }
        return null;
    }

}
