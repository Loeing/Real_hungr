// Generated code from Butter Knife. Do not modify!
package com.reduber.hungr;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.reduber.hungr.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165184, "field 'flingContainer'");
    target.flingContainer = (com.lorentzos.flingswipe.SwipeFlingAdapterView) view;
    view = finder.findRequiredView(source, 2131165187, "method 'right'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.right();
        }
      });
    view = finder.findRequiredView(source, 2131165186, "method 'left'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.left();
        }
      });
  }

  public static void reset(com.reduber.hungr.MainActivity target) {
    target.flingContainer = null;
  }
}
