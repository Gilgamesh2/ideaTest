import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.zgl.idea.entity.TaskParams;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XmlTest {
    @Test
    public void test() {
        XmlMapper mapper = new XmlMapper();
        try {
            TaskParams taskParams = (TaskParams) mapper.readValue("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<任务参数>\n" +
                    "    <编号>1</编号>\n" +
                    "    <姓名>zgl</姓名>\n" +
                    "    <参数列表>\n" +
                    "        <类型 编号 =\"1\">2</类型>\n" +
                    "        <类型 编号 =\"3\">2</类型>\n" +
                    "    </参数列表>\n" +
                    "\n" +
                    "\n" +
                    "</任务参数>", TaskParams.class);
            System.out.println(taskParams);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void test2() {
        File file = new File("test.xml");
        System.out.println(file.exists());
    }

    @Test
    public void listTest() {
        List<String> target = new ArrayList<>();
        target.add("222");
        target.add("111");
        target.remove("111");
        System.out.println(target);
    }

}
