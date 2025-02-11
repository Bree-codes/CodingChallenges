def mySqrt(z: int) -> int:
    if z == 0 or z == 1:
        return z

    left, right = 0, z
    result = 0

    while left <= right:
        mid = (left + right) // 2
        if mid * mid == z:
            return mid
        elif mid * mid < z:
            result = mid
            left = mid + 1
        else:
            right = mid - 1

    return result

x=16
ans = mySqrt(x)
print(f"The square root of {x} is: {ans}")
