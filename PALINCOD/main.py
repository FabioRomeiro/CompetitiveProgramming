for i in range(1,int(input())+1):
    try:
        word=input()
        print("%d %s"%(i, ' "YES"' if word == word[::-1] else ' "NO"'))
    except EOFError: break