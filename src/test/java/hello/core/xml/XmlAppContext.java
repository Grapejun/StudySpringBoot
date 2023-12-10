package hello.core.xml;

import hello.core.member.MemberService;
import net.bytebuddy.description.type.TypeList;
import org.assertj.core.api.Assertions;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.testng.annotations.Test;

public class XmlAppContext {
    @Test
    void xmlAppContext() {
        GenericXmlApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
