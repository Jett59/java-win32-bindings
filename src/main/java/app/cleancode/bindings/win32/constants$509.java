// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$509 {

    static final FunctionDescriptor WNetOpenEnumA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetOpenEnumA$MH = RuntimeHelper.downcallHandle(
        "WNetOpenEnumA",
        constants$509.WNetOpenEnumA$FUNC
    );
    static final FunctionDescriptor WNetOpenEnumW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetOpenEnumW$MH = RuntimeHelper.downcallHandle(
        "WNetOpenEnumW",
        constants$509.WNetOpenEnumW$FUNC
    );
    static final FunctionDescriptor WNetEnumResourceA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetEnumResourceA$MH = RuntimeHelper.downcallHandle(
        "WNetEnumResourceA",
        constants$509.WNetEnumResourceA$FUNC
    );
    static final FunctionDescriptor WNetEnumResourceW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetEnumResourceW$MH = RuntimeHelper.downcallHandle(
        "WNetEnumResourceW",
        constants$509.WNetEnumResourceW$FUNC
    );
    static final FunctionDescriptor WNetCloseEnum$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetCloseEnum$MH = RuntimeHelper.downcallHandle(
        "WNetCloseEnum",
        constants$509.WNetCloseEnum$FUNC
    );
    static final FunctionDescriptor WNetGetResourceParentA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetResourceParentA$MH = RuntimeHelper.downcallHandle(
        "WNetGetResourceParentA",
        constants$509.WNetGetResourceParentA$FUNC
    );
}


