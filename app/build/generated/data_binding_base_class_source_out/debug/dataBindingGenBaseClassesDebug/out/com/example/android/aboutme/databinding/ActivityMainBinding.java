package com.example.android.aboutme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.aboutme.MyName;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final EditText ageEdit;

  @NonNull
  public final TextView ageLabel;

  @NonNull
  public final TextView ageText;

  @NonNull
  public final EditText birthdayEdit3;

  @NonNull
  public final TextView birthdayLabel;

  @NonNull
  public final EditText courseEdit;

  @NonNull
  public final TextView courseLabel;

  @NonNull
  public final EditText crushEdit;

  @NonNull
  public final TextView crushLabel;

  @NonNull
  public final Button doneButton;

  @NonNull
  public final EditText dreamEdit;

  @NonNull
  public final TextView dreamLabel;

  @NonNull
  public final EditText emailEdit;

  @NonNull
  public final TextView emailLabel;

  @NonNull
  public final TextView helloText;

  @NonNull
  public final EditText messageEdit;

  @NonNull
  public final TextView messageLabel;

  @NonNull
  public final EditText nameEdit;

  @NonNull
  public final TextView nameLabel;

  @NonNull
  public final TextView nameText;

  @NonNull
  public final EditText nicknameEdit;

  @NonNull
  public final TextView nicknameLabel;

  @NonNull
  public final TextView nicknameText;

  @NonNull
  public final EditText phoneEdit;

  @NonNull
  public final TextView phoneLabel;

  @NonNull
  public final TextView thanksText;

  @Bindable
  protected MyName mMyName;

  protected ActivityMainBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, EditText ageEdit, TextView ageLabel, TextView ageText,
      EditText birthdayEdit3, TextView birthdayLabel, EditText courseEdit, TextView courseLabel,
      EditText crushEdit, TextView crushLabel, Button doneButton, EditText dreamEdit,
      TextView dreamLabel, EditText emailEdit, TextView emailLabel, TextView helloText,
      EditText messageEdit, TextView messageLabel, EditText nameEdit, TextView nameLabel,
      TextView nameText, EditText nicknameEdit, TextView nicknameLabel, TextView nicknameText,
      EditText phoneEdit, TextView phoneLabel, TextView thanksText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ageEdit = ageEdit;
    this.ageLabel = ageLabel;
    this.ageText = ageText;
    this.birthdayEdit3 = birthdayEdit3;
    this.birthdayLabel = birthdayLabel;
    this.courseEdit = courseEdit;
    this.courseLabel = courseLabel;
    this.crushEdit = crushEdit;
    this.crushLabel = crushLabel;
    this.doneButton = doneButton;
    this.dreamEdit = dreamEdit;
    this.dreamLabel = dreamLabel;
    this.emailEdit = emailEdit;
    this.emailLabel = emailLabel;
    this.helloText = helloText;
    this.messageEdit = messageEdit;
    this.messageLabel = messageLabel;
    this.nameEdit = nameEdit;
    this.nameLabel = nameLabel;
    this.nameText = nameText;
    this.nicknameEdit = nicknameEdit;
    this.nicknameLabel = nicknameLabel;
    this.nicknameText = nicknameText;
    this.phoneEdit = phoneEdit;
    this.phoneLabel = phoneLabel;
    this.thanksText = thanksText;
  }

  public abstract void setMyName(@Nullable MyName myName);

  @Nullable
  public MyName getMyName() {
    return mMyName;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.android.aboutme.R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.android.aboutme.R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMainBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMainBinding)bind(component, view, com.example.android.aboutme.R.layout.activity_main);
  }
}
