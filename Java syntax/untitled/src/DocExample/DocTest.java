package DocExample;

/**
 * 這是測試使用Java Doc 的 Class，在下方會建立methods，並且增加註解的部分
 */

public class DocTest {
    private String testStr;
    private int testInt;


    /**
     * Instantiates a DocTest by test String and testInt
     * @param testStr test String
     * @param testInt test Int
     */

    public DocTest(String testStr, int testInt){
        this.testStr= testStr;
        this.testInt = testInt;
    }


    /**
     * getter method for private field variable testStr
     * @return a string, testStr of DocTest
     */
    public String getTestStr(){
        return this.testStr;
    }
}
