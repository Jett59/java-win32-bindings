// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$260 {

    static final FunctionDescriptor GetXStateFeaturesMask$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetXStateFeaturesMask$MH = RuntimeHelper.downcallHandle(
        "GetXStateFeaturesMask",
        constants$260.GetXStateFeaturesMask$FUNC
    );
    static final FunctionDescriptor LocateXStateFeature$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocateXStateFeature$MH = RuntimeHelper.downcallHandle(
        "LocateXStateFeature",
        constants$260.LocateXStateFeature$FUNC
    );
    static final FunctionDescriptor SetXStateFeaturesMask$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetXStateFeaturesMask$MH = RuntimeHelper.downcallHandle(
        "SetXStateFeaturesMask",
        constants$260.SetXStateFeaturesMask$FUNC
    );
    static final FunctionDescriptor EnableThreadProfiling$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnableThreadProfiling$MH = RuntimeHelper.downcallHandle(
        "EnableThreadProfiling",
        constants$260.EnableThreadProfiling$FUNC
    );
    static final FunctionDescriptor DisableThreadProfiling$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisableThreadProfiling$MH = RuntimeHelper.downcallHandle(
        "DisableThreadProfiling",
        constants$260.DisableThreadProfiling$FUNC
    );
    static final FunctionDescriptor QueryThreadProfiling$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryThreadProfiling$MH = RuntimeHelper.downcallHandle(
        "QueryThreadProfiling",
        constants$260.QueryThreadProfiling$FUNC
    );
}


