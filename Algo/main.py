def mySqrt(x: int) -> int:
    if x == 0 or x == 1:
        return x

    left, right = 0, x
    result = 0

    while left <= right:
        mid = (left + right) // 2
        if mid * mid == x:
            return mid
        elif mid * mid < x:
            result = mid
            left = mid + 1
        else:
            right = mid - 1

    return result

x=25
ans = mySqrt(x)
print(f"The square root of {x} is: {ans}")
