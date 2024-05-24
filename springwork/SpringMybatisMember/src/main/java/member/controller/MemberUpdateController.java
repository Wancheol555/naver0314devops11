package member.controller;

import lombok.NoArgsConstructor;
import member.dto.MemberDto;
import member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping
public class MemberUpdateController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/member/update")
    public String UpdateForm(@RequestParam int num, Model model)
    {
        MemberDto dto=memberService.getData(num);
        model.addAttribute("dto",dto);
        return "member/updateform";
    }

    //수정 후 디테일 페이지로 이동
    @PostMapping("/member/update1")
    public String update(@ModelAttribute MemberDto dto)
    {
        //수정
        memberService.updateMember(dto);
        return "redirect:./detail?num="+dto.getNum();
    }

    //{"status":"success" or "fail"}
    @ResponseBody
    @GetMapping("/member/delete")
    public Map<String ,String > delete(@RequestParam int num, @RequestParam String passwd)
    {
        Map<String ,String > map=new HashMap<>();
        //비번이 맞을경우 데이타 삭제
        boolean b=memberService.isEqualPassCheck(num,passwd);
        if(b) {
            memberService.deleteMember(num);
        }
        map.put("status",b?"success":"fail");
        return map;
    }
}

