// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$391 {

    static final FunctionDescriptor GetMenuStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMenuStringW$MH = RuntimeHelper.downcallHandle(
        "GetMenuStringW",
        constants$391.GetMenuStringW$FUNC
    );
    static final FunctionDescriptor GetMenuState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMenuState$MH = RuntimeHelper.downcallHandle(
        "GetMenuState",
        constants$391.GetMenuState$FUNC
    );
    static final FunctionDescriptor DrawMenuBar$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DrawMenuBar$MH = RuntimeHelper.downcallHandle(
        "DrawMenuBar",
        constants$391.DrawMenuBar$FUNC
    );
    static final FunctionDescriptor GetSystemMenu$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemMenu$MH = RuntimeHelper.downcallHandle(
        "GetSystemMenu",
        constants$391.GetSystemMenu$FUNC
    );
    static final FunctionDescriptor CreateMenu$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle CreateMenu$MH = RuntimeHelper.downcallHandle(
        "CreateMenu",
        constants$391.CreateMenu$FUNC
    );
    static final FunctionDescriptor CreatePopupMenu$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle CreatePopupMenu$MH = RuntimeHelper.downcallHandle(
        "CreatePopupMenu",
        constants$391.CreatePopupMenu$FUNC
    );
}


