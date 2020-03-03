package com.example.android.aboutme.databinding;
import com.example.android.aboutme.R;
import com.example.android.aboutme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.hello_text, 4);
        sViewsWithIds.put(R.id.thanks_text, 5);
        sViewsWithIds.put(R.id.name_label, 6);
        sViewsWithIds.put(R.id.name_edit, 7);
        sViewsWithIds.put(R.id.nickname_label, 8);
        sViewsWithIds.put(R.id.nickname_edit, 9);
        sViewsWithIds.put(R.id.age_label, 10);
        sViewsWithIds.put(R.id.age_edit, 11);
        sViewsWithIds.put(R.id.birthday_label, 12);
        sViewsWithIds.put(R.id.birthday_edit3, 13);
        sViewsWithIds.put(R.id.phone_label, 14);
        sViewsWithIds.put(R.id.phone_edit, 15);
        sViewsWithIds.put(R.id.email_label, 16);
        sViewsWithIds.put(R.id.email_edit, 17);
        sViewsWithIds.put(R.id.course_label, 18);
        sViewsWithIds.put(R.id.course_edit, 19);
        sViewsWithIds.put(R.id.dream_label, 20);
        sViewsWithIds.put(R.id.dream_edit, 21);
        sViewsWithIds.put(R.id.crush_label, 22);
        sViewsWithIds.put(R.id.crush_edit, 23);
        sViewsWithIds.put(R.id.message_label, 24);
        sViewsWithIds.put(R.id.message_edit, 25);
        sViewsWithIds.put(R.id.done_button, 26);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener ageTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myName.age
            //         is myName.setAge((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(ageText);
            // localize variables for thread safety
            // myName.age
            java.lang.String myNameAge = null;
            // myName
            com.example.android.aboutme.MyName myName = mMyName;
            // myName != null
            boolean myNameJavaLangObjectNull = false;



            myNameJavaLangObjectNull = (myName) != (null);
            if (myNameJavaLangObjectNull) {




                myName.setAge(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener nameTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myName.name
            //         is myName.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(nameText);
            // localize variables for thread safety
            // myName
            com.example.android.aboutme.MyName myName = mMyName;
            // myName.name
            java.lang.String myNameName = null;
            // myName != null
            boolean myNameJavaLangObjectNull = false;



            myNameJavaLangObjectNull = (myName) != (null);
            if (myNameJavaLangObjectNull) {




                myName.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener nicknameTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of myName.nickname
            //         is myName.setNickname((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(nicknameText);
            // localize variables for thread safety
            // myName
            com.example.android.aboutme.MyName myName = mMyName;
            // myName.nickname
            java.lang.String myNameNickname = null;
            // myName != null
            boolean myNameJavaLangObjectNull = false;



            myNameJavaLangObjectNull = (myName) != (null);
            if (myNameJavaLangObjectNull) {




                myName.setNickname(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.EditText) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.EditText) bindings[19]
            , (android.widget.TextView) bindings[18]
            , (android.widget.EditText) bindings[23]
            , (android.widget.TextView) bindings[22]
            , (android.widget.Button) bindings[26]
            , (android.widget.EditText) bindings[21]
            , (android.widget.TextView) bindings[20]
            , (android.widget.EditText) bindings[17]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[4]
            , (android.widget.EditText) bindings[25]
            , (android.widget.TextView) bindings[24]
            , (android.widget.EditText) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.EditText) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[5]
            );
        this.ageText.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nameText.setTag(null);
        this.nicknameText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.myName == variableId) {
            setMyName((com.example.android.aboutme.MyName) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyName(@Nullable com.example.android.aboutme.MyName MyName) {
        this.mMyName = MyName;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.myName);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String myNameName = null;
        com.example.android.aboutme.MyName myName = mMyName;
        java.lang.String myNameNickname = null;
        java.lang.String myNameAge = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (myName != null) {
                    // read myName.name
                    myNameName = myName.getName();
                    // read myName.nickname
                    myNameNickname = myName.getNickname();
                    // read myName.age
                    myNameAge = myName.getAge();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ageText, myNameAge);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameText, myNameName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nicknameText, myNameNickname);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.ageText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ageTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nameText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nicknameText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nicknameTextandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): myName
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}