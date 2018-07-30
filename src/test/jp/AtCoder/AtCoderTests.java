package test.jp.AtCoder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import org.junit.Test;
import org.junit.Assert;

public class AtCoderTests {

	@Test
	public void atCoderTest() {
		String ret;

		ret = runAsIO("Hello World!!", (t) -> jp.AtCoder.AtCoder.Main.main(t));
		System.out.println(ret);
		Assert.assertEquals(ret,  "Hello World!!");

		ret = runAsIO("12 34\n567\n89", (t) ->  jp.AtCoder.AtCoderBeginner01.Main.main(t));
		System.out.println(ret);
		Assert.assertEquals(ret,  "613 89");
		ret = runAsIO("13 34\n567\n89", (t) -> jp.AtCoder.AtCoderBeginner01.Main.main(t));
		System.out.println(ret);
		Assert.assertEquals(ret,  "614 89");

		ret = runAsIO("3 4", (t) -> jp.AtCoder.AtCoderBeginner02.Main.main(t));
		System.out.println(ret);
		Assert.assertEquals(ret,  "Even");
		ret = runAsIO("1 21", (t) -> jp.AtCoder.AtCoderBeginner02.Main.main(t));
		System.out.println(ret);
		Assert.assertEquals(ret,  "Odd");

		ret = runAsIO("101", (t) -> jp.AtCoder.AtCoderBeginner03.Main.main(t));
		System.out.println(ret);
		Assert.assertEquals(ret,  "2");
		ret = runAsIO("000", (t) -> jp.AtCoder.AtCoderBeginner03.Main.main(t));
		System.out.println(ret);
		Assert.assertEquals(ret,  "0");

		ret = runAsIO("3\n8 12 40", (t) -> jp.AtCoder.AtCoderBeginner04.Main.main(t));
		System.out.println(ret);
		Assert.assertEquals(ret,  "2");
		ret = runAsIO("4\n5 6 8 10", (t) -> jp.AtCoder.AtCoderBeginner04.Main.main(t));
		System.out.println(ret);
		Assert.assertEquals(ret,  "0");
		ret = runAsIO("6\n382253568 723152896 37802240 379425024 404894720 471526144", (t) -> jp.AtCoder.AtCoderBeginner04.Main.main(t));
		System.out.println(ret);
		Assert.assertEquals(ret,  "8");
	}

	public String runAsIO(String str, Consumer<String[]> func) {
        String result = null;

        InputStream defaultSysin = System.in;
        PrintStream defaultSysout = System.out;

        try {
	        ByteArrayInputStream sysin = new ByteArrayInputStream(str.getBytes("utf-8"));
	        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	        PrintStream sysout = new PrintStream(byteArrayOutputStream);
	        System.setIn(sysin);
            System.setOut(sysout);

            func.accept(new String[] {});
            result = new String(byteArrayOutputStream.toByteArray());

            sysout.close();
        	sysin.close();
        }catch(Exception e) {}

        System.setIn(defaultSysin);
        System.setOut(defaultSysout);

        return result.trim();
	}
}
