// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$11 {

    static final FunctionDescriptor WriteRaw8$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteRaw8$MH = RuntimeHelper.downcallHandle(
        "WriteRaw8",
        constants$11.WriteRaw8$FUNC
    );
    static final FunctionDescriptor ReadRaw16$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadRaw16$MH = RuntimeHelper.downcallHandle(
        "ReadRaw16",
        constants$11.ReadRaw16$FUNC
    );
    static final FunctionDescriptor WriteRaw16$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle WriteRaw16$MH = RuntimeHelper.downcallHandle(
        "WriteRaw16",
        constants$11.WriteRaw16$FUNC
    );
    static final FunctionDescriptor ReadRaw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadRaw$MH = RuntimeHelper.downcallHandle(
        "ReadRaw",
        constants$11.ReadRaw$FUNC
    );
    static final FunctionDescriptor WriteRaw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WriteRaw$MH = RuntimeHelper.downcallHandle(
        "WriteRaw",
        constants$11.WriteRaw$FUNC
    );
    static final FunctionDescriptor ReadRaw64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadRaw64$MH = RuntimeHelper.downcallHandle(
        "ReadRaw64",
        constants$11.ReadRaw64$FUNC
    );
}


