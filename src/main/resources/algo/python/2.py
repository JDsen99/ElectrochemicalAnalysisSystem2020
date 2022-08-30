import io
import json
import sys

# 解析获取数据
result = dict()
py_data = json.loads(sys.argv[1])

# 算法处理1 ：数据获取
data = py_data['data']

def main(data):
    # 算法处理2 : 输出处理
    from scipy import signal
    import matplotlib.pyplot as plt

    y = signal.medfilt(volume=data, kernel_size=3)
    z = signal.medfilt(volume=data, kernel_size=15)

    plt.plot(data, 'k.')
    plt.plot(y, 'b.-')  # 在给定大小的邻域内取中值替代数据值，在邻域中没有元素的位置补0
    plt.plot(z, 'r.-')
    plt.legend(['original signal', 'length 3', 'length 15'])

    return plt


plt = main(data)

# 图片打印
buffer = io.BytesIO()
io_data = plt.figure().canvas.print_png(buffer)
print(buffer.getvalue())
buffer.close()
