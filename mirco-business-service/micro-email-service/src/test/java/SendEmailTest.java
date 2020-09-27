import com.dxk.spring.EmailServiceApplication;
import com.dxk.spring.dto.EmailInfoDTO;
import com.dxk.spring.service.MimeMessageService;
import com.dxk.spring.service.SimpleMailService;
import com.dxk.spring.vo.ResultVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName: SendEmailTest
 * @Description:
 * @Date: 2020/9/24 21:23
 * @Author: dingxingkai
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmailServiceApplication.class)
public class SendEmailTest {

    @Autowired
    private SimpleMailService simpleMailService;

    @Autowired
    private MimeMessageService mimeMessageService;

    /**
     * 测试普通邮件发送
     */
    @Test
    public void test1() {
        String[] to = {"979352276@qq.com"};//1325244083
        EmailInfoDTO emailInfoDTO = EmailInfoDTO.builder()
                .from("979352276@qq.com")
                .to(to)
                .subject("test")
                .text("test")
                .build();
        ResultVO resultVO = simpleMailService.sendSimpleEmail(emailInfoDTO);
        System.out.println(resultVO.toString());
    }

    /**
     * 测试复杂邮件发送
     */
    @Test
    public void test2() {
        String[] to = {"979352276@qq.com"};//1325244083
        EmailInfoDTO emailInfoDTO = EmailInfoDTO.builder()
                .from("979352276@qq.com")
                .to(to)
                .subject("test")
                .text("test")
                .build();
        ResultVO resultVO = mimeMessageService.sendMimeMessage(emailInfoDTO);
        System.out.println(resultVO.toString());
    }
}
