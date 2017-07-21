package yz.learning.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yz.learning.springboot.dao.IScoreDao;
import yz.learning.springboot.entity.Score;

import java.util.List;

@RestController
@RequestMapping(value = "/score")
public class ScoreController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScoreController.class);

    @Autowired
    private IScoreDao scoreService;

    @RequestMapping(value = "list")
    public List<Score> getScoreList() {
        LOGGER.info("读取所有Score(s)");
        LOGGER.info("更新的行数：" + scoreService.updateScoreById(88.8f, 2));
        scoreService.delete(1);

        return scoreService.getList();
    }
}
