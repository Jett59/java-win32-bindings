// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$490 {

    static final FunctionDescriptor DeviceDsmAddDataSetRange$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmAddDataSetRange$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmAddDataSetRange",
        constants$490.DeviceDsmAddDataSetRange$FUNC
    );
    static final FunctionDescriptor DeviceDsmValidateInput$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmValidateInput$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmValidateInput",
        constants$490.DeviceDsmValidateInput$FUNC
    );
    static final FunctionDescriptor DeviceDsmOutputBlock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceDsmOutputBlock$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmOutputBlock",
        constants$490.DeviceDsmOutputBlock$FUNC
    );
    static final FunctionDescriptor DeviceDsmGetOutputLength$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmGetOutputLength$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmGetOutputLength",
        constants$490.DeviceDsmGetOutputLength$FUNC
    );
    static final FunctionDescriptor DeviceDsmValidateOutputLength$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmValidateOutputLength$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmValidateOutputLength",
        constants$490.DeviceDsmValidateOutputLength$FUNC
    );
    static final FunctionDescriptor DeviceDsmGetOutputBlockLength$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeviceDsmGetOutputBlockLength$MH = RuntimeHelper.downcallHandle(
        "DeviceDsmGetOutputBlockLength",
        constants$490.DeviceDsmGetOutputBlockLength$FUNC
    );
}


