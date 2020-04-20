package org.smartregister.fp.features.visit.presenter;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;

import com.vijay.jsonwizard.constants.JsonFormConstants;
import com.vijay.jsonwizard.fragments.JsonFormFragment;
import com.vijay.jsonwizard.interactors.JsonFormInteractor;
import com.vijay.jsonwizard.presenters.JsonWizardFormFragmentPresenter;
import com.vijay.jsonwizard.widgets.NativeRadioButtonFactory;

import org.smartregister.fp.common.util.ConstantsUtils;
import org.smartregister.fp.common.util.FPFormUtils;
import org.smartregister.fp.features.visit.view.StartVisitJsonWizardFormFragment;

/**
 * Created by keyman on 04/08/18.
 */
public class StartVisitWizardJsonFormFragmentPresenter extends JsonWizardFormFragmentPresenter {

    public static final String TAG = StartVisitWizardJsonFormFragmentPresenter.class.getName();

    public StartVisitWizardJsonFormFragmentPresenter(JsonFormFragment formFragment, JsonFormInteractor jsonFormInteractor) {
        super(formFragment, jsonFormInteractor);
    }

    @Override
    public void setUpToolBar() {
        super.setUpToolBar();

    }

    @Override
    protected boolean moveToNextWizardStep() {
        if (!"".equals(mStepDetails.optString(JsonFormConstants.NEXT))) {
            JsonFormFragment next = StartVisitJsonWizardFormFragment.getFormFragment(mStepDetails.optString(ConstantsUtils.NEXT));
            getView().hideKeyBoard();
            getView().transactThis(next);
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        key = (String) view.getTag(com.vijay.jsonwizard.R.id.key);
        type = (String) view.getTag(com.vijay.jsonwizard.R.id.type);
        switch (type) {
            case ConstantsUtils.EXPANSION_PANEL:
                String info = (String) view.getTag(com.vijay.jsonwizard.R.id.label_dialog_info);
                if (!TextUtils.isEmpty(info)) {
                    showInformationDialog(view);
                }
                break;
            case ConstantsUtils.EXTENDED_RADIO_BUTTON:
                showInformationDialog(view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }


    @Override
    protected void nativeRadioButtonClickActions(View view) {
        String type = (String) view.getTag(com.vijay.jsonwizard.R.id.specify_type);
        String specifyWidget = (String) view.getTag(com.vijay.jsonwizard.R.id.specify_widget);
        Log.i(TAG, "The dialog content widget is this: " + specifyWidget);
        if (JsonFormConstants.CONTENT_INFO.equals(type) && specifyWidget.equals(JsonFormConstants.DATE_PICKER)) {
            NativeRadioButtonFactory.showDateDialog(view);
        } else if (JsonFormConstants.CONTENT_INFO.equals(type) && !specifyWidget.equals(JsonFormConstants.DATE_PICKER)) {
            FPFormUtils formUtils = new FPFormUtils();
            formUtils.showGenericDialog(view);
        } else if (view.getId() == com.vijay.jsonwizard.R.id.label_edit_button) {
            setRadioViewsEditable(view);
        } else {
            showInformationDialog(view);
        }
    }
}