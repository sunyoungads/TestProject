import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator


class testClass : Parcelable {
    var data10 : Int =0
    var data20: String?=null

    companion object {
        @JvmField

        val CREATOR : Parcelable.Creator<testClass> = object : Parcelable.Creator<testClass>{
            // 객체 복원은 이 creator에서 된 부분에서 복원하게된다.
            override fun createFromParcel(dest: Parcel?): testClass {
                val test = testClass()
                test.data10 = dest?.readInt()!!
                test.data20 = dest?.readString()
                return test

            }
                //배열 전달 시
            override fun newArray(dest: Int): Array<testClass?> {
                return arrayOfNulls<testClass>(dest)
            }
        }
    }
        // intend에 담을때는 해당 객체가 호출된다.
    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest?.writeInt(data10)
        dest?.writeString(data20)
    }

    override fun describeContents(): Int {
        return 0
    }
}