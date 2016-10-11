###Materi penggunaan activity dan fragment lifecycle

Activity Lifecycle
------------------
#States
Activity punya 6 states

1. Created

2. Started

3. Resumed

4. Paused

5. Stopped

6. Destroyed


#Methods
Activity lifecycle ada 7 methods

1. onCreate()

2. onStart()

3. onResume()

4. onPause()

5. onStop()

6. onRestart()

7. onDestroy()

![diagram lifecycle](https://developer.android.com/images/training/basics/basic-lifecycle.png)
https://developer.android.com/images/training/basics/basic-lifecycle.png

#Situations
Usecase yang sering kejadian dan hubungannya sama lifecycle activity

* Waktu buka app

    ```
    onCreate() --> onStart() -->  onResume()
    ```

* Pencet tombol back dan keluar app

    ```
    onPaused() -- > onStop() --> onDestory()
    ```

* Pencet tombol home 

    ```
    onPaused() --> onStop()
    ```

* Buka app dari recent

    ```
    onRestart() --> onStart() --> onResume()
    ```

* Buka app lain dari notification bar atau buka setting

    ```
    onPaused() --> onStop()
    ```

* Pencet tombol back dari app lain terus kembali ke app kita

    ```
    onRestart() --> onStart() --> onResume()

    ```

* Buka dialog

    ```
    onPause()
    ```

* Dialog ditutup

    ```
    onResume()
    ```

* Ada telepon masuk waktu app kita lagi didepan

    ```    
    onPause() --> onResume() 
    ```

* User angkat telepon yang masuk

    ```
    onPause()
    ```

* User tutup telepon masuk

    ```
    onResume()
    ```

* Screen off

    ```
    onPaused() --> onStop()
    ```

* Screen on

    ```
    onRestart() --> onStart() --> onResume()
    ```
---------

Contributor : dhytodev@gmail.com - rpgmania37@gmail.com
