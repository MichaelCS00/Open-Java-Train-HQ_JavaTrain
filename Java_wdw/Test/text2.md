## 2. 举出几个常用的 git 命令，描述什么情况下会产生代码冲突？如何解决？
#
1. 查看分支：git branch
2. 创建分支：git branch <name>
3. 切换分支：git checkout <name>
4. 创建+切换分支：git checkout -b <name>
5. 合并某分支到当前分支：git merge <name>
6. 删除分支：git branch -d <name>
7. git init
8. git clone
9. git add
10. git status
11. git commit
12. git pull 
13. git push 
#
多个分支向同一个远端分支推送代码时会有冲突，可以修改冲突代码--->add--->commit--->push