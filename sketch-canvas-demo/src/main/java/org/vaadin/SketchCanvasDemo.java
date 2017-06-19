package org.vaadin;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.declarative.Design;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;

/**
 * !! DO NOT EDIT THIS FILE !!
 *
 * This class is generated by Vaadin Designer and will be overwritten.
 *
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot @AutoGenerated @SuppressWarnings("serial") public class SketchCanvasDemo extends VerticalLayout {
  protected Button clear;
  protected Button showCurrentState;
  protected Button setColors;
  protected Button setToolPencil;
  protected Button setToolEllipse;
  protected HorizontalLayout buttonLo1;
  protected Button downloadAsSVG;
  protected Button downloadAsPNG;
  protected Button toggleSetEnabled;
  protected Button setWidth100;
  protected Button setWidth300;
  protected Button setHeight100;
  protected Button setHeight400;
  protected Button setFullSize;
  protected SketchCanvas sketchCanvas;
  protected SketchCanvas sketchCanvas1;
  protected SketchCanvas sketchCanvas2;
  protected SketchCanvas sketchCanvas3;
  protected SketchCanvas sketchCanvas4;

  public SketchCanvasDemo() {
    Design.read(this);
  }
}
