package com.dialiax.sweeto.databinding;
import com.dialiax.sweeto.R;
import com.dialiax.sweeto.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySignBindingImpl extends ActivitySignBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView4, 1);
        sViewsWithIds.put(R.id.textView13, 2);
        sViewsWithIds.put(R.id.textView14, 3);
        sViewsWithIds.put(R.id.textView15, 4);
        sViewsWithIds.put(R.id.userName, 5);
        sViewsWithIds.put(R.id.emailEditText, 6);
        sViewsWithIds.put(R.id.passwordEditText, 7);
        sViewsWithIds.put(R.id.textView16, 8);
        sViewsWithIds.put(R.id.textView17, 9);
        sViewsWithIds.put(R.id.googleSignIn, 10);
        sViewsWithIds.put(R.id.button2, 11);
        sViewsWithIds.put(R.id.signUpbutton, 12);
        sViewsWithIds.put(R.id.alreadyhavebutton, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySignBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivitySignBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (android.widget.EditText) bindings[6]
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.EditText) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.EditText) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}