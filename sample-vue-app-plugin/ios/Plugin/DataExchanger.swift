import Foundation

@objc public class DataExchanger: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
