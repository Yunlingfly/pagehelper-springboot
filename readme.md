这是一个pagehelper+mybatis+mysql+springboot编写的项目<br/>
By 芸灵fly@CSDN

克隆项目：

$ git clone https://github.com/Yunlingfly/pagehelper-springboot.git

使用IDEA：

File->Open导入文件夹

Maven构建完成后，可以先把test.sql文件的数据导入到MySQL，然后Run PagehelperdemoApplication

输入：http://localhost:8081/getAll?pageNum=1&pageSize=10 即可看到结果

说明：pageNum为页码，pageSize为页面要行数（记录）