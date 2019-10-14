#编写程序，输入本金、年利率和年数，计算复利（结果保留两位小数）

money = int(input("请输入本金："))
rate = float(input("请输入年利率："))
years = int(input("请输入年数："))
amount = money*((1+rate/100)**years)
print(str.format("本金利率和为：{0:2.2f}",amount))
