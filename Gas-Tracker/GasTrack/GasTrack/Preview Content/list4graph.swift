//
//  list4graph.swift
//  GasTrack
//
//  Created by Michael Liu on 2022-12-26.
//

import Foundation

struct gasList {
    let id = UUID()
    let date: Date
    let ppl: Double
    
    init(day: String, gasPrice: Double) {
        let formatter = DateFormatter()
        formatter.dateFormat = "yyyyMMdd"
        
        self.date = formatter.date(from: day) ?? Date.distantPast
        self.ppl = gasPrice
    }
}
