//
//  graph.swift
//  GasTrack
//
//  Created by Michael Liu on 2022-12-24.
//

import SwiftUI
import Charts

struct StepCount: Identifiable {
    let id = UUID()
    let weekday: Date
    let steps: Int
    
    init(day: String, steps: Int) {
        let formatter = DateFormatter()
        formatter.dateFormat = "yyyyMMdd"
        
        self.weekday = formatter.date(from: day) ?? Date.distantPast
        self.steps = steps
    }
}


let currentWeek: [StepCount] = [
    StepCount(day: "20220717", steps: 4200),
    StepCount(day: "20220718", steps: 15000),
    StepCount(day: "20220719", steps: 2800),
    StepCount(day: "20220720", steps: 10800),
    StepCount(day: "20220721", steps: 5300),
    StepCount(day: "20220722", steps: 10400),
    StepCount(day: "20220723", steps: 4000)
]

struct graph: View {
    var body: some View {
        VStack {
            VStack {
                GroupBox ( "Line Chart - Step Count") {
                    Chart {
                        ForEach(currentWeek) {
                            LineMark(
                                x: .value("Week Day", $0.weekday, unit: .day),
                                y: .value("Step Count", $0.steps)
                            )
                        }
                    }
                }
            }
        }
    }
}

struct graph_Previews: PreviewProvider {
    static var previews: some View {
        graph()
    }
}
