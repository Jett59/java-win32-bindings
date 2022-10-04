// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPOINTER_TYPE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("pointerType"),
                    Constants$root.C_LONG$LAYOUT.withName("pointerId"),
                    Constants$root.C_LONG$LAYOUT.withName("frameId"),
                    Constants$root.C_LONG$LAYOUT.withName("pointerFlags"),
                    Constants$root.C_POINTER$LAYOUT.withName("sourceDevice"),
                    Constants$root.C_POINTER$LAYOUT.withName("hwndTarget"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("x"),
                        Constants$root.C_LONG$LAYOUT.withName("y")
                    ).withName("ptPixelLocation"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("x"),
                        Constants$root.C_LONG$LAYOUT.withName("y")
                    ).withName("ptHimetricLocation"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("x"),
                        Constants$root.C_LONG$LAYOUT.withName("y")
                    ).withName("ptPixelLocationRaw"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("x"),
                        Constants$root.C_LONG$LAYOUT.withName("y")
                    ).withName("ptHimetricLocationRaw"),
                    Constants$root.C_LONG$LAYOUT.withName("dwTime"),
                    Constants$root.C_LONG$LAYOUT.withName("historyCount"),
                    Constants$root.C_LONG$LAYOUT.withName("InputData"),
                    Constants$root.C_LONG$LAYOUT.withName("dwKeyStates"),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("PerformanceCount"),
                    Constants$root.C_LONG$LAYOUT.withName("ButtonChangeType"),
                    MemoryLayout.paddingLayout(32)
                ).withName("pointerInfo"),
                Constants$root.C_LONG$LAYOUT.withName("touchFlags"),
                Constants$root.C_LONG$LAYOUT.withName("touchMask"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("left"),
                    Constants$root.C_LONG$LAYOUT.withName("top"),
                    Constants$root.C_LONG$LAYOUT.withName("right"),
                    Constants$root.C_LONG$LAYOUT.withName("bottom")
                ).withName("rcContact"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("left"),
                    Constants$root.C_LONG$LAYOUT.withName("top"),
                    Constants$root.C_LONG$LAYOUT.withName("right"),
                    Constants$root.C_LONG$LAYOUT.withName("bottom")
                ).withName("rcContactRaw"),
                Constants$root.C_LONG$LAYOUT.withName("orientation"),
                Constants$root.C_LONG$LAYOUT.withName("pressure")
            ).withName("touchInfo"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("pointerType"),
                    Constants$root.C_LONG$LAYOUT.withName("pointerId"),
                    Constants$root.C_LONG$LAYOUT.withName("frameId"),
                    Constants$root.C_LONG$LAYOUT.withName("pointerFlags"),
                    Constants$root.C_POINTER$LAYOUT.withName("sourceDevice"),
                    Constants$root.C_POINTER$LAYOUT.withName("hwndTarget"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("x"),
                        Constants$root.C_LONG$LAYOUT.withName("y")
                    ).withName("ptPixelLocation"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("x"),
                        Constants$root.C_LONG$LAYOUT.withName("y")
                    ).withName("ptHimetricLocation"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("x"),
                        Constants$root.C_LONG$LAYOUT.withName("y")
                    ).withName("ptPixelLocationRaw"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("x"),
                        Constants$root.C_LONG$LAYOUT.withName("y")
                    ).withName("ptHimetricLocationRaw"),
                    Constants$root.C_LONG$LAYOUT.withName("dwTime"),
                    Constants$root.C_LONG$LAYOUT.withName("historyCount"),
                    Constants$root.C_LONG$LAYOUT.withName("InputData"),
                    Constants$root.C_LONG$LAYOUT.withName("dwKeyStates"),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("PerformanceCount"),
                    Constants$root.C_LONG$LAYOUT.withName("ButtonChangeType"),
                    MemoryLayout.paddingLayout(32)
                ).withName("pointerInfo"),
                Constants$root.C_LONG$LAYOUT.withName("penFlags"),
                Constants$root.C_LONG$LAYOUT.withName("penMask"),
                Constants$root.C_LONG$LAYOUT.withName("pressure"),
                Constants$root.C_LONG$LAYOUT.withName("rotation"),
                Constants$root.C_LONG$LAYOUT.withName("tiltX"),
                Constants$root.C_LONG$LAYOUT.withName("tiltY")
            ).withName("penInfo")
        ).withName("$anon$0")
    ).withName("tagPOINTER_TYPE_INFO");
    public static MemoryLayout $LAYOUT() {
        return tagPOINTER_TYPE_INFO.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return tagPOINTER_TYPE_INFO.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)tagPOINTER_TYPE_INFO.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        tagPOINTER_TYPE_INFO.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_TYPE_INFO.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        tagPOINTER_TYPE_INFO.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment touchInfo$slice(MemorySegment seg) {
        return seg.asSlice(8, 144);
    }
    public static MemorySegment penInfo$slice(MemorySegment seg) {
        return seg.asSlice(8, 120);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

