package zhang;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import scala.collection.immutable.Seq;
import scala.jdk.javaapi.CollectionConverters;

public class HelloWorld {
    public static void main(String[] args) {
//        Factorial fa = new Factorial();
//        System.out.println(fa.factorial(BigInteger.valueOf(40)));
//        MyClass cls = new MyClass(100,"yqq");
//        System.out.println(cls.getName());
//        String name = "Yqqsb";
//        ExistUpper ex = new ExistUpper();
//        boolean result = ex.existUpper(name);
//        System.out.println(result);
//        boolean nameHasUpperCase =
//                name.chars().anyMatch((int ch) -> Character.isUpperCase((char) ch));
//        System.out.println(nameHasUpperCase);
//        GetMax gm = new GetMax();
//        System.out.println(gm.max(10,200));
//        Seq<String> data = CollectionConverters.asScala(Arrays.asList("one", "two").iterator()).toSeq();
//        PrintArgs pa = new PrintArgs();
//        pa.printArgs(data);
        EchoArgs ea = new EchoArgs();
        Seq<String> data = CollectionConverters.asScala(Arrays.asList("one","two").iterator()).toSeq();
        ea.echoArgs(data);
//        PA pa = new PA();
//        Seq<String> data = CollectionConverters.asScala(Arrays.asList("one","two").iterator()).toSeq();
//        pa.pa(data);
//        Seq<String> data = CollectionConverters.asScala(Arrays.asList("one","two").iterator()).toSeq();
//        ForArgs fa = new ForArgs();
//        fa.forArgs(data);
//        GreetStrings gs = new GreetStrings();
//        gs.greetStrings();
//        ScalaList sl = new ScalaList();
//        sl.scalaList();
//        ScalaTuple st = new ScalaTuple();
//        st.scalaTuple();
//        scala.collection.immutable.List<String> data = CollectionConverters.asScala(Arrays.asList("aaa","bbb").iterator()).toList();
//        WhileLoop wl = new WhileLoop();
//        wl.printArgs(data);
//        FormatArgs fa = new FormatArgs();
//        String result = fa.formatArgs(CollectionConverters.asScala(Arrays.asList("aaa","bbb").iterator()).toList());
//        System.out.println(result);
//        MapAndForYield mafy = new MapAndForYield();
//        mafy.mapAndForYield();
//        ScalaMapSet sm = new ScalaMapSet();
//        sm.scalaSet();
//        sm.scalaMap();
//        ScalaOption so = new ScalaOption();
//        so.scalaOption();
//        ChecksumAccumulator csa = new ChecksumAccumulator();
//        csa.checksumAccumulator();
//        System.out.println(csa.getSum());

    }
}
