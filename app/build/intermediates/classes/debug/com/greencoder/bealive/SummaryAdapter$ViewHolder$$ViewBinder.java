// Generated code from Butter Knife. Do not modify!
package com.greencoder.bealive;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SummaryAdapter$ViewHolder$$ViewBinder<T extends com.greencoder.bealive.SummaryAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230723, "field 'placeTextView'");
    target.placeTextView = finder.castView(view, 2131230723, "field 'placeTextView'");
    view = finder.findRequiredView(source, 2131230724, "field 'dateTextView'");
    target.dateTextView = finder.castView(view, 2131230724, "field 'dateTextView'");
    view = finder.findRequiredView(source, 2131230722, "field 'colorView'");
    target.colorView = view;
  }

  @Override public void unbind(T target) {
    target.placeTextView = null;
    target.dateTextView = null;
    target.colorView = null;
  }
}
