## 举出几个常用的 git 命令，描述什么情况下会产生代码冲突？如何解决？
1.初始化git仓库命令
git init
2.添加用户和邮箱 
$  git config --global user.name "wumginxm"
$  git config --global user.email zhangsan2519@163.comGi
git add 文件名 添加文件
git commit -m  0.1  提交代码库
git pull 更新代码
git push 提交代码
1. git checkout 文件名 还原本地文件
   git checkout 分支名称切换分支
2. git diff 比较工作区文件 和本地仓库文件 不加参数的话
3. git merge b   指定分支名 合并当前分支
4. git rebase b  把 b 合并到当前分支
5. git reset --hard   还原到上一个版本
6.. git  log 查看提交记录
7. git reset -- hard  23ddnndnfdd  还原到指定版本
8. git rm 文件名 删除暂存区文件
9. .git branch -a 查看远程分支
10. git push origin master  --force 强制推送文件到远程服务器 替换原来的文件
11. git reflog show dev 查看操作记录  git reset --hard  版本号     还原具体的版本




