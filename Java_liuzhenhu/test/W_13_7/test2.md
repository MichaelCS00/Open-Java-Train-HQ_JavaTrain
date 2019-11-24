# 常用的git命令

​	1.git init

​	2.git clone 你的GitHub仓库地址

​	3.git add 你想要上传的文件

​	4.git config --global user.email "......."   <!--定义全局的邮件地址-->

   	git config --global user.name "......"    <!--定义全局的用户名-->
   	git config --list    <!--查看配置信息-->

​	5.git commit -m "......."

​	6.git push 

​	7.git pull --rebase origin master   <!--仓库没有修改的情况下-->

   	git pull origin master

​	8.git log <!--查看提交历史-->

# git冲突

## 原因

1.两个人拉取相同的文件到本地仓库后分别进行了修改后同时上传

2.不同分支在进行合并时

## 解决方法

1.git pull

2.<<<<<HEAD

​	..........自己的

​	========

​	..........下拉的

​	>>>>>

​	修改并合并

3.git commit

4.git push