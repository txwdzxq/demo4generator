package com.eoner.generate;

/**
 * @author mi
 * @date 2019/6/6 9:30
 */
public class Generate {
    public static void main(String[] args) {
        // args = new String[]{"-configfile", "src\\main\\resources\\mybatis-generator.xml", "-overwrite"};
    
        // try {
        //     List<String> warnings = new ArrayList<String>();
        //     boolean overwrite = true;
        //     ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        //     InputStream is = classloader.getResourceAsStream("generatorConfig.xml");
        //     ConfigurationParser cp = new ConfigurationParser(warnings);
        //     Configuration config = cp.parseConfiguration(is);
        //     DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        //     MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        //     myBatisGenerator.generate(null);
        // } catch (SQLException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // } catch (InvalidConfigurationException e) {
        //     e.printStackTrace();
        // } catch (XMLParserException e) {
        //     e.printStackTrace();
        // }
        String resultMap = ResultMapUtil.getResultMap(InfectiousPatientInformationVO.class);
        System.out.println(resultMap);
    }
}
