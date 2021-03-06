
# 각 정렬의 성능분석

각 정렬당 {32,256,1024,....1048576}개의 데이터를 넣고 수행시간을 측정함. 정렬의 특성과 정렬, 역정렬, 랜덤 데이터를 분석하고 데이터의 종류에 따른 성능을 측정하고 하는데 의의가 있음.

## 선택정렬

선택정렬은 입력 배열 전체에서 최솟값을 선택하여 배열의 0번재 자리에 옮긴후 배열의 0번쨰 자리를 제외한 나머지 배열에서 최솟값을 찾은후 1번째 자리에 옮긴다. 이러한 방식을 반복하여 오름차순 정렬을 완성시킨다.

40|30|20|50|10
---|---|---|---|---|

10이란 최솟값은 0번째 자리로


10|30|20|50|40
---|---|---|---|---|
제외|  |   |   |   |

10을 제외한 나머지 데이터에서 최솟값 20을 찾음. 그리고 1번쨰 데이터와 바꿈

10|20|30|50|40
---|---|---|---|---|
제외|제외  |   |   |   |

이러한 과정을 반복하면

10|20|30|40|50
---|---|---|---|---|


![image](https://user-images.githubusercontent.com/100903674/166396326-4c502afd-8fb8-492a-8c54-b8e5160d2939.png)

수행시간을 T(N)이라 하고 비교시간을 S(N)=N-1이라 한다면
1회  수행할때  최솟값을 찾고 0번째 넣을때 N-1번
2회  수행할때  최솟값을 찾고 0번째 넣을때 N-2번이므로

T(N)=S(N)+S(N-1)+....+S(3)+S(2)=(N-1)+(N-2)+...2+1=(N-1)N/2 걸림 따라서 시간 복잡도는 O(N^2)이다.
그래프를 보면 N^2과 비슷한 양상을 볼 수 있음. 정렬된 데이터는 위치를 바꾸는 시간이 으므로 시간이 현저히 적음




## 퀵 정렬
하나의 리스트를 피벗(pivot)을 기준으로 두 개의 부분리스트로 나누어 하나는 피벗보다 작은 값들의 부분리스트, 다른 하나는 피벗보다 큰 값들의 부분리스트로 정렬한 다음, 각 부분리스트에 대해 다시 위 처럼 재귀적으로 수행하는 정렬이다. 쓰여진 알고리즘의 피벗은 탐색범위의 중앙값이다.



![image](https://user-images.githubusercontent.com/100903674/166458352-5864c3f5-be85-4cf1-b32b-6b984b2a8bb6.png)

피벗에 따라 시간복잡도는 O(N^2)이나 O(NlogN)으로 바뀌는데 위의 그래프를 보면 O(NlogN)과 비슷한 양상을 볼 수있다. 


## 삽입정렬

![image](https://user-images.githubusercontent.com/100903674/166265585-4a3b7f9d-43f9-438e-8797-3192c99fe310.png)

## 힙 정렬

정렬을 할때 최소힙의 구조를 이용하여 정렬하는 방법




![image](https://user-images.githubusercontent.com/100903674/166452658-8d4c5c17-b88f-4835-b919-cbde7bcf1d2f.png)
.
힙은 이진트리를 이용하고 힙을 만드는데의 수행시간은 힙의 높이를 내려가는 만큼이므로 수행시간은 ![image](https://user-images.githubusercontent.com/100903674/166480363-34979e49-e6bc-4b76-baf8-abca82325688.png)이다. 힙을 만드는 시간복잡도는 즉

![image](https://user-images.githubusercontent.com/100903674/166480612-02e22bca-5b2f-4c97-b08d-c2f610c54238.png)이다. 이 힙을 만드는 과정을 데이터의 수 N번 만큼 해야하므로 힙정렬의 수행시간은 ![image](https://user-images.githubusercontent.com/100903674/166481109-58ed5d13-bf98-4a7c-a8b6-e91f3e01510a.png) 이다.


위의 그래프를 보면 NlogN과 얼추 비슷한 모습을 볼 수 있다. 이때 수행시간은 데이터의 크기에 영향을 크게 받고 힙을 만드는 시간에는 영향을 작게 받으므로 데이터의 형태에 따라 수행시간이 크게 좌지우지 되지 않는 것을 볼 수 있다.












## 버블정렬
버블 정렬은 이웃하는 숫자를 비교하여  작은수를 앞쪽으로 큰수를 뒤쪽으로 보낸다. 이렇게 앞쪽에서부터 비교하는 과정을 전체적으로 처리하는 과정을 pass 라한다. 이러한 pass를 할때마다 큰수가 맨뒤로 가므로 비교하는 과정을 맨뒤의 수를 빼면서 진행을한다.




![image](https://user-images.githubusercontent.com/100903674/166256518-aeb2e686-9729-4e51-b25f-79beee9f9535.png)

이때 비교를 하면서 정렬을 하는 시간을 T(n)이라 하고 비교를 하는시간을 S(n)=n-1이라 하면
T(n)=S(n)+S(n-1)+ ......+S(2)=(n-1)n/2 가되므로 시간 복잡도는 O(n^2)이다. 위의 그래프는 n^2 그래프와 비슷한 모양인걸 확인할 수 있다. 정렬된 데이터를 넣었을때 데이터간의 위치 교환을 하지 않으므로 수행시간이 다른 데이터보다 훨씬 적은 것을 볼 수 있다.



## 쉘정렬

셸 정렬은 다음과 같은 삽입 정렬의 성질을 이용, 보완한 삽입정렬의 일반화로 볼 수 있다.


![image](https://user-images.githubusercontent.com/100903674/166246713-a8ab33ce-7f1b-4db3-95f6-c5532bee0720.png)


쉘 정렬의 시간복잡도는 보통 O(n^1.25) 정도로 알려지고 있다. 위의 그래프를 보면 n^1.25 비슷한 모양인것을 볼 수 있다.
