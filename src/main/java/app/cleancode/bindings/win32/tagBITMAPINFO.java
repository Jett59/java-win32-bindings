// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagBITMAPINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("biSize"),
            Constants$root.C_LONG$LAYOUT.withName("biWidth"),
            Constants$root.C_LONG$LAYOUT.withName("biHeight"),
            Constants$root.C_SHORT$LAYOUT.withName("biPlanes"),
            Constants$root.C_SHORT$LAYOUT.withName("biBitCount"),
            Constants$root.C_LONG$LAYOUT.withName("biCompression"),
            Constants$root.C_LONG$LAYOUT.withName("biSizeImage"),
            Constants$root.C_LONG$LAYOUT.withName("biXPelsPerMeter"),
            Constants$root.C_LONG$LAYOUT.withName("biYPelsPerMeter"),
            Constants$root.C_LONG$LAYOUT.withName("biClrUsed"),
            Constants$root.C_LONG$LAYOUT.withName("biClrImportant")
        ).withName("bmiHeader"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("rgbBlue"),
            Constants$root.C_CHAR$LAYOUT.withName("rgbGreen"),
            Constants$root.C_CHAR$LAYOUT.withName("rgbRed"),
            Constants$root.C_CHAR$LAYOUT.withName("rgbReserved")
        ).withName("tagRGBQUAD")).withName("bmiColors")
    ).withName("tagBITMAPINFO");
    public static MemoryLayout $LAYOUT() {
        return tagBITMAPINFO.$struct$LAYOUT;
    }
    public static MemorySegment bmiHeader$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }
    public static MemorySegment bmiColors$slice(MemorySegment seg) {
        return seg.asSlice(40, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


