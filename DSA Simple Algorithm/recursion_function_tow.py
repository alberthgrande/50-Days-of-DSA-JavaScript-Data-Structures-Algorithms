def F(n):
    if n <= 1:
        return 1
    else:
        return F(n - 1) + F(n - 2)


print(F(18))
