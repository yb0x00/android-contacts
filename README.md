# android-contacts

## 화면구성
![Android Emulator - Pixel_4_API_26_5554 2024-06-27 오후 2_27_13](https://github.com/yb0x00/android-contacts/assets/169421565/6fef447f-ee4c-4ff5-bcdb-8c31c9158cf3)
![Android Emulator - Pixel_4_API_26_5554 2024-06-26 오후 9_13_59](https://github.com/yb0x00/android-contacts/assets/169421565/5a9bc3a8-cec3-47b9-a85a-f3dc8cbf6122)
![Android Emulator - Pixel_4_API_26_5554 2024-06-27 오후 2_32_11](https://github.com/yb0x00/android-contacts/assets/169421565/48d35064-4935-4a25-9c78-049c55249a98)

[화면 구성 요소]
- 캐릭터 아이콘
- 이름 입력란
- 전화번호 입력란
- 메일 입력란
- 더보기 버튼
- 생일 선택란
- 성별 선택란 : 여성 or 남성 택1
- 메모 입력란
- 취소/저장 버튼

## 구현할 기능 목록

- 더보기를 누르면 생일, 성별, 메모 입력 폼이 등장 ✔️showMoreEditTexts()
- 생일 선택란을 클릭하면 달력에서 생일을 선택할 수 있게함 ✔️showDatePickere()
- 저장 버튼
  - 이름을 입력하지 않으면 '이름은 필수 입력 항목입니다'라는 토스트 메시지를 보여줌
  - 입력하지 않으면 '전화번호는 필수 입력 항목입니다'토스트 메시지를 보여줌
  - 저장 버튼을 누르면 '저장이 완료 되었습니다'라는 토스트 메시지를 보여줌 ✔️onSaveClicked()
- 취소 버튼
  - 취소 버튼을 누르면 '취소 되었습니다'라는 토스트 메시지를 보여줌 ✔️onCancelClicked()
