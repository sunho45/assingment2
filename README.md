
# 각 정렬의 성능분석

각 정렬당 {32,256,1024,....1048576}개의 데이터를 넣고 수행시간을 측정함. 정렬의 특성과 정렬, 역정렬, 랜덤 데이터를 분석하고 데이터의 종류에 따른 성능을 측정하는데 의의가 있음.

## 선택정렬


![image](https://user-images.githubusercontent.com/100903674/166396326-4c502afd-8fb8-492a-8c54-b8e5160d2939.png)



## 퀵 정렬


![image](https://user-images.githubusercontent.com/100903674/166458352-5864c3f5-be85-4cf1-b32b-6b984b2a8bb6.png)




### 삽입정렬

![image](https://user-images.githubusercontent.com/100903674/166265585-4a3b7f9d-43f9-438e-8797-3192c99fe310.png)

## 힙 정렬



![image](https://user-images.githubusercontent.com/100903674/166452658-8d4c5c17-b88f-4835-b919-cbde7bcf1d2f.png)













## 버블정렬
버블 정렬은 이웃하는 숫자를 비교하여  작은수를 앞쪽으로 큰수를 뒤쪽으로 보낸다. 이렇게 앞쪽에서부터 비교하는 과정을 전체적으로 처리하는 과정을 pass 라한다. 이러한 pass를 할때마다 큰수가 맨뒤로 가므로 비교하는 과정을 맨뒤의 수를 빼면서 진행을한다.


이때 비교를 하면서 정렬을 하는 시간을 T(n)이라 하고 비교를 하는시간을 S(n)=n-1이라 하면
T(n)=S(n)+S(n-1)+ ......+S(2)=(n-1)n/2 가되므로 시간 복잡도는 O(n^2)이다.


![image](https://user-images.githubusercontent.com/100903674/166256518-aeb2e686-9729-4e51-b25f-79beee9f9535.png)

그래프를 보면 n^2과 비슷한 양상을 볼 수 있다. 이떄 정렬된 

## 쉘정렬



![image](https://user-images.githubusercontent.com/100903674/166246713-a8ab33ce-7f1b-4db3-95f6-c5532bee0720.png)



