while True:
    try:
        value = int(input())
        if value == 42: break
        print(value)
    except EOFError:
        break