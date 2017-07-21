package yz.learning.springboot.controller;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {
    private static Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    private static AtomicLong count = new AtomicLong();

    @ResponseBody
    @RequestMapping(value = "/get-count", method = RequestMethod.GET)
    @ApiOperation(value = "获取计数", notes = "更多说明")
    public ModelMap getCount(HttpServletRequest request,
                             HttpServletResponse response) {
        LOGGER.info("getCount");
        ModelMap map = new ModelMap();
        map.addAttribute("count", count.incrementAndGet());
        return map;
    }
}
